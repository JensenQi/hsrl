package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Slam_1074 : Card() {
    override val id = 1074
    override val name = "猛击"
    override val description = "对一个随从造成 2点伤害，如果 它依然存活，则抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "“咚次哒次，咚次哒次”：如果你听到食人魔这样的“歌声”，那已经太晚了。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96e9130696a5ff7fb028dbd9f4a2caa357ac2b2b1b99e964034a8d939f1d3cc9.png"
}
