package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Temporus_46544 : Card() {
    override val id = 46544
    override val name = "坦普卢斯"
    override val description = "<b>战吼：</b>在本回合结束后，你的对手连续行动两个回合。然后你行动两个回合。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他从冒险者身上学到了最终极的时间魔法：回档。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8ceaa8f6d3fedfea18a8437a34d681ea77b7bfe90726dcdac623122894712bf.png"
}
