package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowbomber_1937 : Card() {
    override val id = 1937
    override val name = "暗影投弹手"
    override val description = "<b>战吼：</b>对每个英雄造成3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "作为一个投弹手，她干活的时候总是有点敷衍了事。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d9df0a6c965463a01cd2ec02fe4c3bef4aabbc256f8d17749bd16208c8e29e71.png"
}
