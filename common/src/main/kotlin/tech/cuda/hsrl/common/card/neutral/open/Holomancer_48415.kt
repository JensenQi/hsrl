package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Holomancer_48415 : Card() {
    override val id = 48415
    override val name = "全息术士"
    override val description = "在你的对手使用一张随从牌后，召唤一个该随从的1/1复制。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "帮帮我，旗鼓相当的对手。你是我唯一的希望。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a26eca6826992c4586cea87012bad65a429b4643054dc26fa76f930bf5cd90a.png"
}
