package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KroluskBarkstripper_58980 : Card() {
    override val id = 58980
    override val name = "裂树三叶虫"
    override val description = "<b>法术迸发：</b>随机消灭一个敌方随从。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "有一次我的朋友闲得去给三叶虫翻身……就再也没回来！"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a71730e3ab92c904e1572ee0ed9724a0d24219cd9607c423d0cd59b63e0ddddc.png"
}
