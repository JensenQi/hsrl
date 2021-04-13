package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OmegaAgent_49167 : Card() {
    override val id = 49167
    override val name = "欧米茄探员"
    override val description = "<b>战吼：</b>如果你有十个法力水晶，召唤该随从的两个复制。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "不只是寻找真相，她们还会给对手十秒钟的时间，再进行抓捕。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5598f4f066baaa53d2e0e1f355e36e54b93f797be8860e90ee0025ad86131034.png"
}
