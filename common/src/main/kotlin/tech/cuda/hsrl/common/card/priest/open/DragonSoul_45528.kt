package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonSoul_45528 : Card() {
    override val id = 45528
    override val name = "巨龙之魂"
    override val description = "你在一回合中施放三个法术后，召唤一条5/5的龙。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "死亡之翼手下的地精制造了它，但上面的彩虹光效是巨龙亲自加上的。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/61ed42bda6c9fa4622b0765f736d516b8e40b4745fc9cc15039118594a8afcad.png"
}
