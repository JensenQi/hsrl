package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeckOfChaos_61885 : Card() {
    override val id = 61885
    override val name = "混乱套牌"
    override val description = "使你牌库中所有随从牌的法力值消耗和攻击力互换。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "没错，就是混乱，不过是有组织的混乱。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3694668652b15570565e1237f26ed080f0481f19a2f1652ca87662fbe12f518.png"
}
