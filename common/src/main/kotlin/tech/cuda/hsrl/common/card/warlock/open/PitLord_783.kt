package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PitLord_783 : Card() {
    override val id = 783
    override val name = "深渊领主"
    override val description = "<b>战吼：</b>对你的英雄造成5点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "或许玛诺洛斯、玛瑟里顿和布鲁塔卢斯都已经死了，但其实深渊领主还有很多很多。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fe1dcdf92adb2531a661a7aa9c09f548ad3cf6178957a4b11bafb4faeb10ea6a.png"
}
