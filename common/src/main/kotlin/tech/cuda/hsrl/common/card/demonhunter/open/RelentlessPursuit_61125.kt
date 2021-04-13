package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RelentlessPursuit_61125 : Card() {
    override val id = 61125
    override val name = "冷酷追杀"
    override val description = "在本回合中，使你的英雄获得+4攻击力和<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "偷了恶魔猎手的玉米炸热狗，就是这种下场。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7cafba99ba318f3c1d1af078ba2fe9785a73687396fd6f0a6c2df93f4774cbd5.png"
}
