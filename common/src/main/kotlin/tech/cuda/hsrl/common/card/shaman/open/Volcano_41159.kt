package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Volcano_41159 : Card() {
    override val id = 41159
    override val name = "火山喷发"
    override val description = "造成 15点伤害，随机分配到所有随从身上。 <b>过载：</b>（2）"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "许多年轻的萨满喜欢以火山为主题来做毕业设计。"
    override val artist = "Gustav Schmidt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a409cc783020977be78c75dfaa80921ff5d2da1496f088c4090c957e38833ba.png"
}
