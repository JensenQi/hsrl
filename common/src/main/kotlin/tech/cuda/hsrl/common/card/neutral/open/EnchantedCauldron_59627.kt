package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnchantedCauldron_59627 : Card() {
    override val id = 59627
    override val name = "魔化大锅"
    override val description = "<b>法术迸发：</b>随机施放一个法力值消耗相同的法术。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "大锅喝可乐。"
    override val artist = "Matt O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/548952b12dba493b28f0701d2caa6476a424de73b84f9957bec31f93bf06e4fe.png"
}
