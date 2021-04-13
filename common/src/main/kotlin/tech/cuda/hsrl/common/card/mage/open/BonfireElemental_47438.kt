package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BonfireElemental_47438 : Card() {
    override val id = 47438
    override val name = "篝火元素"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，抽一张牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "下一步：棉花糖元素。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41588a4244473009b7bfd18ab088aa612e4e184428c1ff3e3249d8aade7f1b4f.png"
}
