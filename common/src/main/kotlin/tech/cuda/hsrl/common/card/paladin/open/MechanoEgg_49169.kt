package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MechanoEgg_49169 : Card() {
    override val id = 49169
    override val name = "机械蛋"
    override val description = "<b>亡语：</b>召唤一个8/8的机械暴龙。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "补铁补血，健康之选。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3dcfea6c5b8016782199323dae9e11382b5273ac169051d16fe05fa731a49b94.png"
}
