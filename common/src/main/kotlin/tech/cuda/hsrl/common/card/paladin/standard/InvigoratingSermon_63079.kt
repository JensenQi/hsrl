package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InvigoratingSermon_63079 : Card() {
    override val id = 63079
    override val name = "动员布道"
    override val description = "使你手牌，牌库以及战场中的所有随从获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "每个弱队教练都会这一招。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e4bd5546cab645d262244ff380e63aca9028d5a016b473b1b80ba0d63701274.png"
}
