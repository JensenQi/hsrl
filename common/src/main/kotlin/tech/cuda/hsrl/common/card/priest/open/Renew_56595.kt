package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Renew_56595 : Card() {
    override val id = 56595
    override val name = "复苏"
    override val description = "恢复 3点 生命值。<b>发现</b>一张法术牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "脸怎么蓝了？精神焕发！"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51326fd4a34b16fbb91c9f68c1bcec861e20eeebed0b085f8de654ebcceca5a5.png"
}
