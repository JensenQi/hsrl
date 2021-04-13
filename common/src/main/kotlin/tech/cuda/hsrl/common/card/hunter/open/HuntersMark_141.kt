package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HuntersMark_141 : Card() {
    override val id = 141
    override val name = "猎人印记"
    override val description = "使一个随从的生命值变为1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "千万不要和猎人玩捉迷藏的游戏。"
    override val artist = "Jimmy Lo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d34484a1c3d748b469e43fe8409779b17c26a0e8b611372f64c1dca57a88a1cd.png"
}
