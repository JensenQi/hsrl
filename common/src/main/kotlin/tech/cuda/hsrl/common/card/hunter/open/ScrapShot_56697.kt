package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScrapShot_56697 : Card() {
    override val id = 56697
    override val name = "废铁射击"
    override val description = "造成 3点伤害。随机使你手牌中的一张野兽牌获得+3/+3。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "用敌人的护甲为你的野兽加码！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f0e57a15e1909e9f6b316ba5e14a3200319833e9d89c12726e4da071ab81d4f3.png"
}
