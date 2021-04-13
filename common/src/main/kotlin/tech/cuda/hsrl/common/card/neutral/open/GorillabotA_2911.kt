package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GorillabotA_2911 : Card() {
    override val id = 2911
    override val name = "A3型机械金刚"
    override val description = "<b>战吼：</b>如果你控制其他任何机械，则<b>发现</b>一张机械牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "A1和A2型机械金刚都发疯了，早知道不给它们喂香蕉了……"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b235b744c4ca6640c6c5cabf72ff41423cb95af397b4d5f05c0856192f143603.png"
}
