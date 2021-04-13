package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wandmaker_59646 : Card() {
    override val id = 59646
    override val name = "魔杖工匠"
    override val description = "<b>战吼：</b>随机将一张你职业的法力值消耗为（1）的法术牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "图中各种物美价廉的魔杖都是她亲手制作的。但猫头鹰不是，猫头鹰是纯野生的。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/893eb0c3c20c9f06cca5659b3136346666b8dd320d79d1a7ddc7cc25ec049a01.png"
}
