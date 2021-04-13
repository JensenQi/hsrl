package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Tyrantus_41954 : Card() {
    override val id = 41954
    override val name = "泰拉图斯"
    override val description = "无法成为法术或英雄技能的目标。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "历经数千年的演变后，它变成了我们现在所熟知的精灵龙。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8b0a547eb492d81d69f05110b69c36961281aa4c7b47c4771d9bb512e47beadf.png"
}
