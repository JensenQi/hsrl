package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PridesFury_63027 : Card() {
    override val id = 63027
    override val name = "狮群之怒"
    override val description = "使你的所有随从获得+1/+3。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "第四天：我觉得他们开始起疑了。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd404a1c104592d0ab95b492527f8c18de1c835f518de7b0cc3c2a41f7835a49.png"
}
