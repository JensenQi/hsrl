package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CauldronElemental_46658 : Card() {
    override val id = 46658
    override val name = "坩埚元素"
    override val description = "你的其他元素获得+2攻击力。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "所以说没事不要煮一些奇奇怪怪的东西。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f9b9ead69f643c4985815e2f4a8243a986506ec21dde6b3a4af436b8a08a30ee.png"
}
