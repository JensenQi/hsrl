package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Overwhelm_59449 : Card() {
    override val id = 59449
    override val name = "数量压制"
    override val description = "对一个随从造成 2点伤害。你每控制一只野兽，便多造成一点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "成吨、成吨的鹿角小飞兔，学园的学生在美酒节玩得实在是太太太过分了。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1835686fee7b71d11636f455d61094ef388b39f6e0e8d1cf15a18e7e8448adb.png"
}
