package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightsJustice_68363 : Card() {
    override val id = 68363
    override val name = "圣光的正义"
    override val description = ""
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "玛克扎尔王子收集了不少稀有的武器，他赋予它们生命，并让它们为他起舞。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be19ef9684e6ab68b1534abfff168a1630860f2a17c01817a729c365d2e876a9.png"
}
