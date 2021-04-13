package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RocketAugmerchant_57183 : Card() {
    override val id = 57183
    override val name = "火箭改装师"
    override val description = "<b>战吼：</b>对一个随从造成1点伤害并使其获得<b>突袭</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“别担心，改装伤不到我的。”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2619bddea791b478e6594018e4f8a90e2f3a08f5662a8545ccf7d6d32c6a8d32.png"
}
