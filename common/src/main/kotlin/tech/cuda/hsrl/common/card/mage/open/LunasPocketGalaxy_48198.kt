package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LunasPocketGalaxy_48198 : Card() {
    override val id = 48198
    override val name = "露娜的口袋银河"
    override val description = "使你牌库中所有随从牌的法力值消耗变为（1）点。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "在露娜的导师发明了口袋黑洞之后，露娜成了天文系的新主任。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e202b34cfdd1682264f4eab5c21a1f742282a86e58ff5b9de5357ded0a3a4843.png"
}
