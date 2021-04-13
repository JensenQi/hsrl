package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Slam_69945 : Card() {
    override val id = 69945
    override val name = "猛击"
    override val description = "对一个随从造成 2点伤害，如果 它依然存活，则抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "“咚次哒次，咚次哒次”：如果你听到食人魔这样的“歌声”，那已经太晚了。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf4a12279b7e5ffc5189530081e167b554f3176b6242750f12d5d0e4f1a35cf7.png"
}
