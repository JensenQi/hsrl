package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnyfinCanHappen_2898 : Card() {
    override val id = 2898
    override val name = "亡者归来"
    override val description = "召唤七个在本局对战中死亡的 鱼人。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Loe
    override val background = "淹没在鱼人大军的狂潮下吧！"
    override val artist = "Ryan Metcalf"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/48246292f31a33854b225de9d0e6d7c6cf7854c3b980389161cb9046433e37b4.png"
}
