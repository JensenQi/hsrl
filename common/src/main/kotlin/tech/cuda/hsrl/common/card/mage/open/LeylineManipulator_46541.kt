package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LeylineManipulator_46541 : Card() {
    override val id = 46541
    override val name = "魔网操控者"
    override val description = "<b>战吼：</b>如果你的手牌中有你的套牌之外的牌，则这些牌的法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "两点之间，魔网线最短。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3adb74aeaf531f3f8f66cfd4a3733ac70fefb9d0de2d4f467c0c237009938505.png"
}
