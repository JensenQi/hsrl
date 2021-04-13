package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoisterousBard_43523 : Card() {
    override val id = 43523
    override val name = "喧哗的诗人"
    override val description = "<b>战吼：</b>使你的其他随从获得+1生命值。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "小时候她喜欢滚石头玩，现在她登上了《滚石》的封面。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/16fe673d8b4534bf00832c64fabe1ed72fadd616d4136b9972c07d35b0bf56a1.png"
}
