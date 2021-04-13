package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuardianOfKings_1068 : Card() {
    override val id = 1068
    override val name = "列王守卫"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>为你的英雄恢复 6点生命值。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "神圣的造物从天而降...真是老掉牙的剧情！"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d1a876e134122b51be0eee25853847863914458575d6272a19d0777bc72ad663.png"
}
