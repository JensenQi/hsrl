package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MuckHunter_47606 : Card() {
    override val id = 47606
    override val name = "泥沼狩猎者"
    override val description = "<b>突袭，战吼：</b>为你的对手召唤两个2/1的泥沼怪。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "这满身泥浆的家伙真是够拧巴的。"
    override val artist = "Pior Oberson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6fce03af6e5fce436e6bf785259adb8c3f3df1caa68f71a8c7dfe10790116d07.png"
}
