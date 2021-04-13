package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BombToss_47840 : Card() {
    override val id = 47840
    override val name = "投掷炸弹"
    override val description = "造成 2点伤害。召唤一个0/2的地精炸弹。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "这招很不要脸。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00650fee3693b7dc33df8c87e0a77139fe1da90b9bce0d995382b5d497713174.png"
}
