package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LockAndLoad_2484 : Card() {
    override val id = 2484
    override val name = "子弹上膛"
    override val description = "在本回合中，每当你施放一个法术，随机将一张猎人卡牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "雷克萨唤醒米莎，拿起墙角的机关枪，眯着眼睛说道：“子弹上膛！是时候找点乐子了！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d645f0c4cfbd3d020493f98698b1201f0a2e4c9385521234c20ec242ce932a4.png"
}
