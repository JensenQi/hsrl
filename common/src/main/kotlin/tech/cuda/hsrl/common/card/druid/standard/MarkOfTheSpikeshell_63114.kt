package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfTheSpikeshell_63114 : Card() {
    override val id = 63114
    override val name = "尖壳印记"
    override val description = "使一个随从获得+2/+2。如果该随从具有<b>嘲讽</b>，则将该随从的一张复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我绝对符合龟龟俱乐部的入会龟定。”"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/974ec3ad542a1a35b67809b87750685a4a53ec84c6a62f721b675b528583502f.png"
}
