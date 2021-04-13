package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PiercingShot_62812 : Card() {
    override val id = 62812
    override val name = "穿刺射击"
    override val description = "对一个随从造成 6点伤害，超过目标生命值的伤害会命中敌方英雄。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "地精不喜欢花冤枉钱，他们的弹药总能物尽其用。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/daacc6d17460ef163281132aee82c5ab2169e8ef584b240fef9b5f7abc4752c6.png"
}
