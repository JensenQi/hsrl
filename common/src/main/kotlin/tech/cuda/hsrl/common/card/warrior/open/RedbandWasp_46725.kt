package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RedbandWasp_46725 : Card() {
    override val id = 46725
    override val name = "赤环蜂"
    override val description = "<b>突袭</b> 受伤时具有+3攻 击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "虽然也有其他款色，不过当季流行的是红色。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd3b580fba2b97706bf8e6b931bbc778a0c0555599a8b6c8c4af8a233e95710b.png"
}
