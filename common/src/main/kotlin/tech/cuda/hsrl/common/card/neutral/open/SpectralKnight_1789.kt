package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpectralKnight_1789 : Card() {
    override val id = 1789
    override val name = "鬼灵骑士"
    override val description = "无法成为法术或英雄技能的目标。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "精灵龙和鬼灵骑士有什么共同之处？它们的名字里都有“灵”字！"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d54e15bb621d1cfb558c883873b979ca466769f1833081998f8875521124428f.png"
}
