package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CelestialEmissary_49263 : Card() {
    override val id = 49263
    override val name = "星界密使"
    override val description = "<b>战吼：</b>在本回合中，你的下一个法术将获得<b>法术伤害+2</b>。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "唯爱与星辰共舞。"
    override val artist = "L Chanchai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb48711a0a9588f455850add965ad5b3f8d0a7ff92d2496b5da27bb4a294cf51.png"
}
