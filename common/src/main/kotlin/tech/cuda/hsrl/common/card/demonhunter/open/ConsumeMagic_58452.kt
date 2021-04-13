package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConsumeMagic_58452 : Card() {
    override val id = 58452
    override val name = "吞噬魔法"
    override val description = "<b>沉默</b>一个敌方随从。<b>流放：</b>抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "吞噬生的或未熟的魔法时请注意安全。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/26530f01480da1ad9a806164c2c4c0cf67a7306d2b0e9062c1fd49abb04083e9.png"
}
