package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YoggSaronMasterOfFate_60445 : Card() {
    override val id = 60445
    override val name = "尤格-萨隆，命运主宰"
    override val description = "<b>战吼：</b>在本局对战中，如果你施放过10个法术，转动尤格-萨隆的命运之轮。 <i>（还剩 个！）</i> <i>（已经就绪！）</i>"
    override var cost: Int? = 10
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "大转轮吱呀吱尤尤地转……"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f62ed83f03a2d245a519fc0bde457380a7e7b35e7fb33ba9c8b5671fec997ab.png"
}
