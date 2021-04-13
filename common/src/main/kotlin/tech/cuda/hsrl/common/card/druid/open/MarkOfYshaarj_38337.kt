package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfYshaarj_38337 : Card() {
    override val id = 38337
    override val name = "亚煞极印记"
    override val description = "使一个随从获得+2/+2。 如果该随从是野兽，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "只要能变强，丑一点也是值得的。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5da6372a20ca083ec0d9ca3380f5257378c06b5439a09557e319aff03c90036.png"
}
