package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FerociousHowl_47423 : Card() {
    override val id = 47423
    override val name = "凶猛咆哮"
    override val description = "抽一张牌。你每有一张手牌，便获得1点护甲值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "爱会像头饿狼岂可抱着眠 她必给我狠狠的伤疤做留念"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1cdcefeab7ed14cf22f973d4b429c543665dde3ba34ff5c239c8f5d4629c4701.png"
}
