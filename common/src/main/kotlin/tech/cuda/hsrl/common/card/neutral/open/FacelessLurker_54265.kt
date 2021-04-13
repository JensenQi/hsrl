package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessLurker_54265 : Card() {
    override val id = 54265
    override val name = "无面潜伏者"
    override val description = "<b>嘲讽，战吼：</b>将该随从的生命值翻倍。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "长期潜水，一鸣惊人。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/372285421421259755dd783a517859d49c5cc5aa5d0c6e52da954ee8de212306.png"
}
