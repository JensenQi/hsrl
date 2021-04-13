package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ironbark_56684 : Card() {
    override val id = 56684
    override val name = "铁木树皮"
    override val description = "使一个随从获得+1/+3和<b>嘲讽</b>。如果你拥有至少七个法力水晶，则法力值消耗为（0）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“这是大事，年轻人，一定要保护好你的孢子！记住我的话！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/939a363689db96f42c476e89685ce0799224ee2da07af2edb04e3202e869af84.png"
}
