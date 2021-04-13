package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gyreworm_61580 : Card() {
    override val id = 61580
    override val name = "旋岩虫"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则造成3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "这局套圈圈真是太激烈了。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f47011ccce1b3c83efaaabd1fd89cef8c6b53f151369a1e5a2c27603bdf968fc.png"
}
