package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SuddenBetrayal_45529 : Card() {
    override val id = 45529
    override val name = "叛变"
    override val description = "<b>奥秘：</b>当一个随从攻击你的英雄时，改为该随从攻击与其相邻的一个随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "我把你当兄弟，你却想杀我？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d2716fca1b354470d77f6c8a129c0ed6c6c03a92c0082d1b771cc7343cbf3cc.png"
}
