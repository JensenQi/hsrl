package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OnTheHunt_38377 : Card() {
    override val id = 38377
    override val name = "搜寻猎物"
    override val description = "造成 1点伤害。召唤一个1/1的獒犬。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "要是没打中鸭子，獒犬可是会笑话你的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75f9e9ea8adeb735eed3a356928b581ba9008d29dea12af56ad975a4f431c60c.png"
}
