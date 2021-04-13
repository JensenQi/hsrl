package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HuntersMark_68357 : Card() {
    override val id = 68357
    override val name = "猎人印记"
    override val description = "使一个随从的生命值变为1。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "千万不要和猎人玩捉迷藏的游戏。"
    override val artist = "Jimmy Lo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e79d899f0bb1f25a4bf77952baf284c48b55cdc73b0dce885c9291323512c75.png"
}
