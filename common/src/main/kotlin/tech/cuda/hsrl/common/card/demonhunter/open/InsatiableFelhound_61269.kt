package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InsatiableFelhound_61269 : Card() {
    override val id = 61269
    override val name = "贪食地狱犬"
    override val description = "<b>嘲讽</b> <b>腐蚀：</b>获得+1/+1和<b>吸血</b>。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "连续数届，称霸年度吃热狗大赛……以及吃裁判大赛。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a16752af7f20a66770b1fde7a9a90843142897f291c4e51dbe234f69f4bfb291.png"
}
