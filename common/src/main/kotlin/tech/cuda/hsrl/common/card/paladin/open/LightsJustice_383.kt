package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightsJustice_383 : Card() {
    override val id = 383
    override val name = "圣光的正义"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "玛克扎尔王子收集了不少稀有的武器，他赋予它们生命，并让它们为他起舞。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f310794197295d9071fc66e43ec08145ccb9658232fda547cfac273ddbd72ac8.png"
}
