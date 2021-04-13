package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GhuunTheBloodGod_61437 : Card() {
    override val id = 61437
    override val name = "戈霍恩，鲜血之神"
    override val description = "<b>战吼：</b>抽两张牌，使其消耗生命值，而非法力值。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "其他上古之神都在嘲笑可怜的戈霍恩，恣意直呼他的名字，就连玩游戏都从来不带他。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f5a4bdeb21845f2ebf450146ab1f818a88f4870ba3f0b8b7217b374a13679781.png"
}
