package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrakkariDefender_42750 : Card() {
    override val id = 42750
    override val name = "达卡莱防御者"
    override val description = "<b>嘲讽</b>，<b>过载：</b>（3）"
    override var cost: Int? = 3
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "有时候，最好的进攻就是防御。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6816c3f275ec3d3659cb34aa28951a695d9da54263a1ef35d8f5e82598147bc1.png"
}
