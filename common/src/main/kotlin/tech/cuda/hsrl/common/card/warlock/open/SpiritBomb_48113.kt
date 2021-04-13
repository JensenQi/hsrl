package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritBomb_48113 : Card() {
    override val id = 48113
    override val name = "灵魂炸弹"
    override val description = "对一个随从和你的英雄各造成 4点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "充能时间比“神圣愤怒”还长。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3eeb02eae5e4d2b2a7b0b13ed92c892b6a2010ba902e22c327cc220783544537.png"
}
